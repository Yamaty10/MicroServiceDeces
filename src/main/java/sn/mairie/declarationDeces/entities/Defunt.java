package sn.mairie.declarationDeces.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


	@Entity
	@Table(name = "Defunt")
	@Data 
	@NoArgsConstructor @AllArgsConstructor @ToString
	public class Defunt {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name= "nom", length = 30)
		private String nom ;
		private String prenom;
		private String CIN;
		private String profession;
		private String adresse;
		@Temporal(TemporalType.DATE)
		private Date dateNaissance;
		private String lieuNaissance;
		
		@OneToMany(mappedBy = "pere")
		private Collection<DeclarationNaissance> declarationNaissances;

}
