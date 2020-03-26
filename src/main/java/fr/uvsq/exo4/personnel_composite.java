package fr.uvsq.exo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class personnel_composite  implements InterfacePersonnel{
	/**
	 * liste des personnels 
	 */
     private  ArrayList<Personnel>  personnes ;
     /**
      * 
      */
     public personnel_composite(){
    	 personnes= new ArrayList();
     }
     /**
      * 
      * @param personnel
      */
     public void add( Personnel personnel){
    	 personnes.add(personnel);
     }
     /**
      * 
      * @param personnel
      */
     public void remove( Personnel personnel ){
    	 personnes.remove(personnel);
     }
     /**
      * affichage 
      */
	public void print() {
		for ( Personnel p :personnes ){
			System.out.println(p.getId());
		     }
		
	}
	/**
	 * 
	 * @return listePersonnel
	 */
		public ArrayList<Personnel> getlistePersonnel() {
			return personnes;
		}
	}
	
	

