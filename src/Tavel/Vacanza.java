package Tavel;

import java.time.LocalDate;

public class Vacanza {

	// attributi
	private String destinazione, dataFine, dataInizio;

	// costruttore
	public Vacanza(String destinazione, String dataInizio, String dataFine)
			throws IllegalArgumentException, NullPointerException {
		// destinazione
		validaDestinazione(destinazione);
		// data inizio
		validaDataInizio(dataInizio);
		// data fine
		validaDataFine(dataFine);

		this.destinazione = destinazione;
		this.dataFine = dataFine;
		this.dataInizio = dataInizio;

	}

	// metodi getter e setter
	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public String getDataFine() {
		return dataFine;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	// metodi di controllo
	private void validaDestinazione(String destinazione) {
		if (destinazione == null) {
			throw new NullPointerException("La destinazione non può essere null");

		}
	}

	LocalDate oggi = LocalDate.now();

	private void validaDataInizio(String dataInizio) {
		if (dataInizio == null) {
			throw new NullPointerException("La data di inizio non può essere null");
		}
	}

	private void validaDataFine(String dataFine) {
		if (dataFine == null) {
			throw new NullPointerException("La di fine non può essere null");
		}
	}

}
