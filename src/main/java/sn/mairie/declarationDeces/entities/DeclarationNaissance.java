package sn.mairie.declarationDeces.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Data @ToString
@Entity
@Table(name="DeclarationNaissances")
public class DeclarationNaissance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDeclarationNaissance;
	private Date date;
	private String declaration;
	
	
	@ManyToOne
	@JoinColumn(name="idDeclarant")
	private Declarant declarant;
	
	
	private String pere;

	private String mere;
	
	@ManyToMany
	@JoinTable( name = "T_Temoins_DeclarationNaissance",
            joinColumns = @JoinColumn( name = "idDeclarationNaissance" ),
            inverseJoinColumns = @JoinColumn( name = "idTemoin" ) )
	private Collection <Temoin> temoins;
	
	@ManyToOne
	@JoinColumn(name="idCentre")
	private Centre centre;
	
	@ManyToOne
	@JoinColumn(name="idRegistre")
	private Registre registre; 
	
	@ManyToOne
	@JoinColumn(name="idFormationSanitaire")
	private FormationSanitaire formationSanitaire ;
	
	@ManyToMany
    @JoinTable(name = "T_Mention_DeclarationNaissance",
                joinColumns = @JoinColumn( name = "idDeclarationNaissance" ),
                inverseJoinColumns = @JoinColumn( name = "idMention" ) )
	private Collection<Mention> mention;
	
	private String reference;
	private String scanActe;
	private String scanAccouchement;
	private Date dateModification;
	
	
}
