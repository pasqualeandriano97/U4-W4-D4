package andrianopasquale97.U4W4D4.entities;

import lombok.Getter;


@Getter
public class Table {
	private int numTable;
	private int numMaxCoperti;
	private boolean isFree;
	private double costoCoperto;

	public Table(int i, int i1, boolean b, double seatPrice) {
		        numTable = i;
        numMaxCoperti = i1;
        isFree = b;
        costoCoperto = seatPrice;
	}


	public void print() {
		System.out.println("numero tavolo--> " + numTable);
		System.out.println("numero massimo coperti--> " + numMaxCoperti);
		System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
	}

	public int getNumPosti() {
		        return numMaxCoperti;
	}

	public int getNumTable() {
		        return numTable;
	}

	public int getNumTavolo() {
		        return numTable;
	}

	public boolean isOccupato() {
		return !isFree;
	}

	public double getConto() {
		        return costoCoperto;
	}

	public double getCostoCoperto() {
		        return costoCoperto;
	}

	public int getNumMaxCoperti() {
		        return numMaxCoperti;
	}
}
