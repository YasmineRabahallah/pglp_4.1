package fr.uvsq.exo4;

import java.time.LocalDate;
import java.util.ArrayList;

public  final class Immuable_Personnel {
	/**
	 * nom d une personne 
	 */
	private String nom ;
	/**
	 * prenom d une personne 
	 */
	private String prenom ;
	/**
	 * telephone
	 */
	private  ArrayList<String> telephone ;
	/**
	 * fonctions
	 */
	private String fonctions ;
	/**
	 * la date de naissance
	 */
	private LocalDate date ;
	
	private Immuable_Personnel(UserBuilder builder) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.fonctions = fonctions;
	}
	public static class UserBuilder 
    {   
        private final String nom;
        private final String prenom;
        private final String fonctions;
        private LocalDate date ;
        private  ArrayList<String> telephone ;
        
        public UserBuilder(String nom, String prenom , String fonctions) {
            this.nom=nom ;
            this.prenom=prenom;
            this.fonctions=fonctions ;
        }
        public UserBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }
        public UserBuilder num(ArrayList<String> telephone) {
            this.telephone = telephone;
            return this;
        }
        
        
		
		
	}

}
