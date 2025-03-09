package adapters.primary.ui.vu;

import javax.swing.*;

import adapters.primary.ui.models.UiDate;

public class BoutonDate extends JButton {

	/**
	 *Serial Id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *Date date 
	 */
	private UiDate date;
	/**
	 * BoutonDate qui prends la dare et la change en Integer
	 * @param date
	 */
	public BoutonDate(UiDate date) {
		super (Integer.toString(date.getJour()));
		this.date= date;
	}
	/**
	 * renvoi la dates
	 * @return
	 */
	public UiDate getDate() {		 
		return date;
	}

}
