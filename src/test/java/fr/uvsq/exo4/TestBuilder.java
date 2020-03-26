package fr.uvsq.exo4;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;



public class TestBuilder {
	@Test
	public void test1(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").Id(2).build();
		assertEquals(p2.getId(),2, 0) ;
		}
	@Test
	public void test2(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").date(LocalDate.of(1985, Month.DECEMBER, 9)).build();
		assertEquals(p2.getDateDeNaissance(),LocalDate.of(1985, Month.DECEMBER, 9)) ;
		}
	public void test3(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertEquals(p2.getNom(),"rabahallah"); ;
		}
	public void test4(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertEquals(p2.getPrenom(),"yasmine"); ;
		}
	public void test5(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertEquals(p2.getFonctions(),"chargé de mission"); ;
		}
	public void test6(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").telephone("0770662125").build();
		assertEquals(p2.getTelephone(),"0770662125"); ;
		}
	public void test7(){
		Personnel p1 = new Personnel.Builder("rabahallah", "lamia","direct").date(LocalDate.of(1997, Month.DECEMBER, 12)).build();
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").telephone("0770662125").build();
		personnel_composite g = new personnel_composite();
		g.add(p1);
		g.add(p2);
		g.print();
		}
	
	
	

}
