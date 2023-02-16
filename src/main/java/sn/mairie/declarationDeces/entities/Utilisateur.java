package sn.mairie.declarationDeces.entities;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Utilisateurs")
@Data 
@NoArgsConstructor @AllArgsConstructor @ToString
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name= "nom", length = 30)
	private String nom ;
	private String prenom;
	private String sexe ;
	private String adresse;
	private String login ;
	private String password;
	private String statut ;
	private String fonction;
	private String email ;
	private String telephone;
	
	private Collection<DeclarationNaissance> declarationNaissances;

}
