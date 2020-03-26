package fr.uvsq.exo4;

import java.util.ArrayList;

public class AffichageParGroupe   {
	/**
	 * 
	 */
	private  ArrayList<InterfacePersonnel> list =new ArrayList<InterfacePersonnel>();
	/**
	 * 
	 * @param root 
	 */
     public AffichageParGroupe( Personnel root){
		this.list.add(root) ;
	}
     /**
      * 
      * @author Hamila
      *
      */
	private class groupeIterator implements Iterator<InterfacePersonnel> {
		/**
		 * 
		 */
	public groupeIterator(){
		int verifie =0;
		while (verifie< list.size()){
			if (list.get(verifie) instanceof Personnel ){
				verifie++ ;
			}
		   if (list.get(verifie) instanceof personnel_composite ){
			 
			   list.addAll(((personnel_composite) list.get(verifie)).getlistePersonnel());
			   
		   }
		}
	}
	/**
	 * 
	 */
	private int position;
	/**
	 * 
	 */
	public boolean hasNext() {
			if (position < list.size()) {
					
					return true;
			}
			 return false;
		}
	
  /**
   * 
   */
	public InterfacePersonnel Next() {
		InterfacePersonnel p = list.get(position);
		position++ ;
		return p;
	}
	}
	/**
	 * 
	 * @return Iretator
	 */
	public Iterator getIterator(){
        return new groupeIterator();
    }

}
