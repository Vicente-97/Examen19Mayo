package plataforma.online.jacaranda.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Catalogo {

	private Map<String, Serie> mapSeries;
	
	/**
	 * Crea el objeto que nos servirá para tener las series
	 */
	public Catalogo() {
		mapSeries=new HashMap<String, Serie>();
	}
	
	
	/** Añade una serie a la lista de series. Si existe una serie con el mismo nombre lanza una excpetion
	 * 
	 * @param serie
	 * @throws SerieException
	 */
	public void addSerie(String nombreSerie, int anno, Tema tema) throws SerieException {
		if (mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("Ya existe esa serie");
		}
		Serie serie = new Serie(nombreSerie, anno, tema);
		mapSeries.put(serie.getNombreSerie(), serie);
	}
	
	
	/** Añade una temporada a la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void addTemporada(String nombreSerie, String temporada) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.addTemporada(temporada);
	}
	
	
	/** Añade un capítulo a la temporada de la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie o la temporada lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void addCapituloTemporada(String nombreSerie, String temporada, String capitulo) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.addCapituloTemporada(temporada, capitulo);

	}
	
	
	/** Valorar una temporada de la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie o la temporada lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void valorarTemporada(String nombreSerie, String temporada, int valoracion) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.valorarTemporada(temporada, valoracion);
	}
	
	/**
	 * Devuelve el número de temporadas que tiene la serie que se pasa por parámetro
	 * Si no existe la serie saltará la excepción.
	 * @param nombreSerie
	 * @return
	 * @throws SerieException
	 */

	public int numeroDeTemporadasDeUnaSerie(String nombreSerie) throws SerieException{
		if(!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException(String.format("La serie %s no forma parte del catálogo", nombreSerie));
		}
		return mapSeries.get(nombreSerie).numeroTemporadas();
	}
	
	
	
	/** Modifica el tema de una serie. Si no se encuentra la serie o ya tenía ese tema saltará la excepción. 
	 * 
	 * @param nombreSerie
	 * @param nuevoTema
	 * @throws SerieException
	 */
	public void modificarTema( String nombreSerie, Tema nuevoTema) throws SerieException {
		if(!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe tal serie");
			
		}else if(mapSeries.get(nombreSerie).getTema().equals(nuevoTema)) {
			throw new SerieException("Ya existe el tema");
			
		}else{
			mapSeries.get(nombreSerie).setTema(nuevoTema);
		}
			
	}
	
	
	
	/**
	 * Devolverá un listado ordenado de forma creciente por el año de la serie. 
	 * Para cada serie se mostrará su nombre, año y número de temporadas. 
	 * Si no hay ninguna serie de ese tema saltará la excepción.
	 * @param tema
	 * @return
	 * @throws SerieException
	 */
	public  String listadoOrdenadoSeriesDeUnTema(Tema tema)  throws SerieException {
		
		List<Serie> seriesDeUnTema = listadoOrdenadoSeries(tema);
		
		StringBuilder sb = new StringBuilder();
		for(Serie s : mapSeries.values()) {
			if(s.getTema().equals(tema)) {
				seriesDeUnTema.add(s);
			}
		}
		if(seriesDeUnTema.size()!=0) {
			seriesDeUnTema.sort(new Comparator<Serie>() {

				@Override
				public int compare(Serie o1, Serie o2) {
					return o1.getAnno()-o2.getAnno();
				}
			});
			
			for(Serie e : seriesDeUnTema) {
				sb.append(e.getNombreSerie()+", "+ e.getAnno()+", "+ e.numeroTemporadas());
				sb.append(System.lineSeparator());
			}
		}else {
			throw new SerieException("No existe serie de ese tema");
		}
		
		return sb.toString();
	}
	
	
	
	/**
	 * 
	 * Devuelve una lista con las series de una temática dada, o bien, todas si el tema es null.
	 * Si no existe ninguna serie en catálogo para ese tema se devuelve una excepción.
	 * @param tema filtro de selección
	 * @return Lista de series de un tema dado
	 * @throws SerieException
	 */
	public  List<Serie> listadoOrdenadoSeries(Tema tema)  throws SerieException {
		
		List<Serie> seriesDeUnTema = new ArrayList<>();
		for(Serie serie : mapSeries.values()) {
			if(tema==null) {
				seriesDeUnTema.add(serie);
			}else if (tema!=null && tema.equals(serie.getTema())) {
				seriesDeUnTema.add(serie);
			}
		}
		
		if(seriesDeUnTema.isEmpty()) {
			throw new SerieException(String.format("No existen series de temática + %s", tema));
		}
		
		seriesDeUnTema.sort(new Comparator<Serie>() {
			@Override
			public int compare(Serie o1, Serie o2) {
				return o1.getAnno()-o2.getAnno();
			}
		});

		return seriesDeUnTema;
	}
	
	
}
