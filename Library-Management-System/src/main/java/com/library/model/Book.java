package com.library.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "BOOK")
public class Book {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	@Column(name = "ID",nullable = false)
	    private Long id;
	 	
	    @Column(name = "AUTHOR", nullable = false)
	    private String author;
	    
	    @Column(name = "TITLE", nullable = false)
	    private String title;
	    
	    @Column(name = "ISBN", nullable = false)
	    private String isbn;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "borrower_id")
	    private Borrower borrowedBy;
}
