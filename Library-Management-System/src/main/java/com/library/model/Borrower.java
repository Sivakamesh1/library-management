package com.library.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "BORROWER")
public class Borrower {
	 	@Id
	    @GeneratedValue
	 	@Column(name = "ID", nullable = false, unique = true)
	    private Long id;
	 	
	    @Column(name = "NAME", nullable = false, unique = true)
	    private String name;
	    
	    @Column(name = "EMAIL", nullable = false , unique = true)
	    private String email;

	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "borrowedBy", cascade = CascadeType.ALL)
	    private Set<Book> books = new HashSet<>();
}
