package com.example.td.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hiberneteLazyInitialiser","handler"})
public class User extends Audit{
	@Size(min=2,max=30)
	@Column(nullable = false)
	@NotBlank(message = "le nom ne peut pas etre vide")
private String nom;
	@Size(min=2,max=30)
	@Column(nullable = false)
	@NotBlank(message = "le prenom ne peut pas etre vide")
private String prenom;
	@Column(nullable = false)
	@Email(message = "donner un email valide")
	@NotBlank(message ="le email ne peut pas etre vide" )
private String email;
	@Column(nullable = false)
	@Size(min=6,max=50)

private String password;
	@Min(value=16)
private int age;
private Genre gener;
@OneToOne(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JsonIgnoreProperties("user")
private Profil profil;
@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
private List<Maladie>maladies;
}
