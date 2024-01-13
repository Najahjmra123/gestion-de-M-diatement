package com.example.td.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
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
public class Profil {
	@Id 
	private long id;
	@NotBlank(message = "la photo ne peut pas etre vide")
private String photo;
	@NotBlank(message = "adresse obligatoire")
private String adresse;
	@NotBlank(message = "description obligatoire")

private String description;
@Size(min=8,max=16)
private String telephone;
@OneToOne(fetch = FetchType.LAZY)
@MapsId
private User user;
}
