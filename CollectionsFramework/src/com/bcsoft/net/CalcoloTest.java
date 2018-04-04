package com.bcsoft.net;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CalcoloTest {

	public static void main(String[] args) {
		
		List<Calcolo> listCalcoli = new ArrayList<Calcolo>();
		listCalcoli.add(new Calcolo(new Long(115), 1500.50, "Id calcolo 115"));
		listCalcoli.add(new Calcolo(new Long(115), 1000.55, "Id calcolo 115"));
		listCalcoli.add(new Calcolo(new Long(115), 500.85, "Id calcolo 115"));
		listCalcoli.add(new Calcolo(new Long(116), 2500.58, "Id calcolo 116"));
		listCalcoli.add(new Calcolo(new Long(116), 400.65, "Id calcolo 116"));
		listCalcoli.add(new Calcolo(new Long(117), 500.59, "Id calcolo 117"));
		listCalcoli.add(new Calcolo(new Long(117), 100.35, "Id calcolo 117"));
		listCalcoli.add(new Calcolo(new Long(117), 200.46, "Id calcolo 117"));
		listCalcoli.add(new Calcolo(new Long(117), 600.23, "Id calcolo 117"));
		
		Map<Long, List<Calcolo>> mapCalcoli = new HashMap<Long, List<Calcolo>>();
		Iterator<Calcolo> it = listCalcoli.iterator();
		while(it.hasNext()) {
			Calcolo calcolo = it.next();
			
			if(mapCalcoli.containsKey(calcolo.getIdCalcolo())) {
				List<Calcolo> listCalcoliById = mapCalcoli.get(calcolo.getIdCalcolo());
				listCalcoliById.add(calcolo);
			} else {
				List<Calcolo> listCalcoloById = new ArrayList<Calcolo>();
				listCalcoloById.add(calcolo);
				mapCalcoli.put(calcolo.getIdCalcolo(), listCalcoloById);
			}
		}
		
		Map<Long, Double> mapResultCalcoli = new HashMap<Long, Double>();
		
		Iterator<Entry<Long, List<Calcolo>>> itMap = mapCalcoli.entrySet().iterator();
		while(itMap.hasNext()) {
			Entry<Long, List<Calcolo>> entry = itMap.next();
			
			Long idCalcolo = entry.getKey();
			List<Calcolo> listCalcoloTemp = entry.getValue();
			
			double sommaByIdGruppoCalcolo = 0;
			for(Calcolo calcolo : listCalcoloTemp) {
				sommaByIdGruppoCalcolo += calcolo.getImportoCalcolo();
			}
			
			mapResultCalcoli.put(idCalcolo, sommaByIdGruppoCalcolo);
		}
		
		Iterator<Entry<Long, Double>> itMapGlobal = mapResultCalcoli.entrySet().iterator();
		double sommaTuttiCalcoli = 0;
		while(itMapGlobal.hasNext()) {
			Entry<Long, Double> entry = itMapGlobal.next();
			sommaTuttiCalcoli += entry.getValue();
			System.out.println("L'importo del idCalcolo: "+ entry.getKey() + " è " +  entry.getValue());
		}
		System.out.println("La somma totale di tutti i calcoli è: " +  sommaTuttiCalcoli);
	}

}
