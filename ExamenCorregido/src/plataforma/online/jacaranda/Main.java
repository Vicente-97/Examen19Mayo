package plataforma.online.jacaranda;

import plataforma.online.jacaranda.com.Catalogo;
import plataforma.online.jacaranda.com.SerieException;
import plataforma.online.jacaranda.com.Tema;

public class Main {

	
	
	public static void main(String[] args) {
		
		Catalogo catalogo = cargarCatalogo();

		try {
			System.out.println(catalogo.listadoOrdenadoSeriesDeUnTema(null));
			System.out.println("------");
			System.out.println(catalogo.listadoOrdenadoSeriesDeUnTema(Tema.COMEDIA));
			
		} catch (SerieException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Catalogo cargarCatalogo() {
		Catalogo catalogo = new Catalogo();
		try {
			
			catalogo.addSerie("Dallas", 1970, Tema.INTRIGA);
			catalogo.addSerie("Friends", 1990, Tema.COMEDIA);
			catalogo.addSerie("Como conoci a vuestra madre", 2015, Tema.COMEDIA);
			catalogo.addSerie("This is us", 2012, Tema.DRAMA);
			
			
			
			catalogo.addTemporada("Como conoci a vuestra madre", "Temporada 1");
			catalogo.addTemporada("Como conoci a vuestra madre", "Temporada 2");
			catalogo.addTemporada("Friends", "Temporada 1");
			catalogo.addTemporada("This is us", "Empezamos");

			
			// Como conoci a vuestra madre - Temporada 1
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Piloto");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Purple Giraffe");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Sweet Taste of Liberty");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Return of the Shirt");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Okay Awesome");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Slutty Pumpkin");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Matchmaker");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "The Duel");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Belly Full of Turkey");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "The Pineapple Incident");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "The Limo");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "The Wedding");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Drumroll, Please");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Zip, Zip, Zip");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Game Night");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Cupcake");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Life Among the Gorillas");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Nothing Good Happens After 2 A.M.");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Mary the Paralegal");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Best Prom Ever");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Milk");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 1", "Come On");

			// Como conoci a vuestra madre - Temporada 2
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Where Were We?");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "The Scorpion and the Toad");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Brunch");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Ted Mosby: Architect");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "World's Greatest Couple");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Aldrin Justice");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Swarley");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Atlantic City");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Slap Bet");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Single Stamina");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "How Lily Stole Christmas");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "First Time in New York");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Columns");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Monday Night Football");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Lucky Penny");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Stuff");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Arrivederci, Fiero");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Moving Day");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Bachelor Party");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Showdown");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Something Borrowed");
			catalogo.addCapituloTemporada("Como conoci a vuestra madre", "Temporada 2", "Something Blue");

			
			//Friends - Temporada 1
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The Pilot");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Sonogram at the End");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Thumb");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with George Stephanopoulos");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the East German Laundry Detergent");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Butt");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Blackout");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One Where Nana Dies Twice");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One Where Underdog Gets Away");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Monkey");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with Mrs. Bing");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Dozen Lasagnas");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Boobies");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Candy Hearts");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Stoned Guy");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with Two Parts: Part 1");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with Two Parts: Part 2");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with All the Poker");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One Where the Monkey Gets Away");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Evil Orthodontist");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Fake Monica");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Ick Factor");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One with the Birth");
			catalogo.addCapituloTemporada("Friends", "Temporada 1", "The One Where Rachel Finds Out");
			
			
			catalogo.addCapituloTemporada("This is us", "Empezamos", "La familia");
			catalogo.addCapituloTemporada("This is us", "Empezamos", "El problema");
			catalogo.addCapituloTemporada("This is us", "Empezamos", "Los niños");
			catalogo.addCapituloTemporada("This is us", "Empezamos", "Casi el final");
			catalogo.addCapituloTemporada("This is us", "Empezamos", "El final");
			
			
		} catch (SerieException e) {
			e.printStackTrace();
		}
		
		return catalogo;
	}
	
}
