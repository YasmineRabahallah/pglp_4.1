package fr.uvsq.exo4;

import java.time.LocalDate;
import java.util.ArrayList;

public  final class Personnel  implements InterfacePersonnel  {
	/**
	 * nom d une personne 
	 */
	private final String nom ;
	/**
	 * prenom d une personne 
	 */
	private final  String prenom ;
	/**
	 * telephone
	 */
	private    ArrayList<String> telephone ;
	/**
	 * fonctions
	 */
	private final  String fonctions ;
	/**
	 * la date de naissance
	 */
	private  LocalDate  dateDeNaissance ;
	/**
	 * 
	 * id de personne
	 */
	private  final int Id ;
	public int getId()
	{
		return this.Id ;}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public String getFonctions() {
		return fonctions;
	}
	public ArrayList<String> getTelephone() {
		return telephone;
	}
	private Personnel (Builder builder) {
		
		this.nom =  builder.nom;
		this.prenom =  builder.prenom;
		this.fonctions =  builder.fonctions;
		this.dateDeNaissance= builder.dateDeNaissance;
		this.telephone=builder.telephone ;
		this.Id=builder.Id ;
	}
	
	public static class Builder 
    {   private int Id=-1 ;
        private final String nom;
        private final String prenom;
        private final String fonctions;
        private LocalDate dateDeNaissance; 
        

		private  ArrayList<String> telephone = new ArrayList<String>();
        
        public Builder(String nom, String prenom , String fonctions) {
            this.nom=nom ;
            this.prenom=prenom;
            this.fonctions=fonctions ;
        }
        public Builder date(LocalDate  dateDeNaissance) {
            this. dateDeNaissance =  dateDeNaissance;
            return this;
        }
        public Builder Id(int  Id) {
            this.Id =  Id;
            return this;
        }
        public Builder telephone(String  telephone) {
            this.telephone.add(telephone);
            return this;
        }
        
        public Personnel build ( ) {
			 return new Personnel ( this ) ;
			 }
		
		
	}

	public void print() {
		 System.out.println("ID:"+Id );
		
	}

}
