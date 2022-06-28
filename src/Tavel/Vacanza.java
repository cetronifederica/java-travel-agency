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

	public void setDestinazione(String destinazione) throws IllegalArgumentException, NullPointerException {
		validaDestinazione(destinazione);
		this.destinazione = destinazione;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) throws IllegalArgumentException, NullPointerException {
		validaDataInizio(dataInizio);
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) throws IllegalArgumentException, NullPointerException {
		validaDataFine(dataFine);
		this.dataFine = dataFine;
	}

	// metodi di controllo
	private void validaDestinazione(String destinazione) {
		if (destinazione == null) {
			throw new NullPointerException("La destinazione non pu� essere null");
		}
	}

	private void validaDataInizio(LocalDate dataInizio) {
		if (dataInizio == null) {
			throw new NullPointerException("La data di inizio non pu� essere null");
		}
		if (dataInizio.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Data inizio non pu� essere passata");
		}
	}

	private void validaDataFine(LocalDate dataFine) {
		if (dataFine == null) {
			throw new NullPointerException("La di fine non pu� essere null");
		}
		if (dataFine.isBefore(dataInizio)) {
			throw new IllegalArgumentException("La data di fine non pu� essere precedente alla data di inizio");
		}
	}

}
