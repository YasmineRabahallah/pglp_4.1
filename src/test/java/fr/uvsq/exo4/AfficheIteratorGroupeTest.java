package fr.uvsq.exo4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class AfficheIteratorGroupeTest {
	@Test
	public void test1(){
		
		personnel_composite g1 = new personnel_composite(1);
		personnel_composite g2 = new personnel_composite(2);
		personnel_composite g3 = new personnel_composite(3);
		personnel_composite g4 = new personnel_composite(4);
		personnel_composite g5 = new personnel_composite(5);
		personnel_composite g6 = new personnel_composite(6);
		personnel_composite g7 = new personnel_composite(7);
		personnel_composite g8 = new personnel_composite(8);
		personnel_composite g9 = new personnel_composite(9);
		personnel_composite g10 = new personnel_composite(10);
		g1.add(g2);
		g1.add(g3);
		g1.add(g4);
		
		g2.add(g5);
		g2.add(g6);
		g3.add(g7);
		g3.add(g8);
		g4.add(g9);
		g5.add(g10);
		 ArrayList<InterfacePersonnel> list = new ArrayList<InterfacePersonnel>() ;
		  list.add(g1);
		  list.add(g2);
		  list.add(g3);
		  list.add(g4);
		  list.add(g5);
		  list.add(g6);
		  list.add(g7);
		  list.add(g8);
		  list.add(g9);
		  list.add(g10);
		  ArrayList<InterfacePersonnel> list2 = new ArrayList<InterfacePersonnel>() ;
		  AffichageParGroupe af = new  AffichageParGroupe(g1);
			Iterator it = af.getIterator();
			do{
				InterfacePersonnel pr = (InterfacePersonnel)it.Next();
				list2.add(pr);
			}while (it.hasNext()) ;
		 
			assertEquals(list, list2); 
		}
	@Test
	public void test2(){
		
		personnel_composite g1 = new personnel_composite(1);
		personnel_composite g2 = new personnel_composite(2);
		personnel_composite g3 = new personnel_composite(3);
		personnel_composite g4 = new personnel_composite(4);
		personnel_composite g5 = new personnel_composite(5);
		personnel_composite g6 = new personnel_composite(6);
		personnel_composite g7 = new personnel_composite(7);
		personnel_composite g8 = new personnel_composite(8);
		personnel_composite g9 = new personnel_composite(9);
		personnel_composite g10 = new personnel_composite(10);
		g7.add(g1);
		g7.add(g5);
		g7.add(g3);
		g1.add(g2);
		g1.add(g4);
		g3.add(g6);
		g3.add(g8);
		g2.add(g9);
		g2.add(g10);
		ArrayList<InterfacePersonnel> list = new ArrayList<InterfacePersonnel>() ;
		  list.add(g7);
		  list.add(g1);
		  list.add(g5);
		  list.add(g3);
		  list.add(g2);
		  list.add(g4);
		  list.add(g6);
		  list.add(g8);
		  list.add(g9);
		  list.add(g10);
		  ArrayList<InterfacePersonnel> list2 = new ArrayList<InterfacePersonnel>() ;
		  AffichageParGroupe af = new  AffichageParGroupe(g7);
				Iterator it = af.getIterator();
				do{
					InterfacePersonnel pr = (InterfacePersonnel)it.Next();
					list2.add(pr);
				}while (it.hasNext()) ;
			 
				assertEquals(list, list2); 
			}
	
}
