package Tavel;

import java.time.LocalDate;

public class Vacanza {

	// attributi
	private String destinazione;
	private LocalDate dataInizio;
	private LocalDate dataFine;

	// costruttore
	public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine)
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

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	// metodi di controllo
	private void validaDestinazione(String destinazione) {
		if (destinazione == null) {
			throw new NullPointerException("La destinazione non può essere null");

		}
	}

	private void validaDataInizio(LocalDate dataInizio) {
		if (dataInizio == null) {
			throw new NullPointerException("La data di inizio non può essere null");
		}
	}

	private void validaDataFine(LocalDate dataFine) {
		if (dataFine == null) {
			throw new NullPointerException("La di fine non può essere null");
		}
	}

}
