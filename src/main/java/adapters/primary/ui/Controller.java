package adapters.primary.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import adapters.primary.ui.models.UiDate;
import adapters.primary.ui.models.UiPort;
import adapters.primary.ui.vu.PanelAffichage;
import adapters.primary.ui.vu.PanelSelection;

public class Controller implements ActionListener {
    

	/**
	 * Le panelAffichage
	 */
	PanelAffichage panelAffichage;

	/**
	 * le panelSelection
	 */
	PanelSelection panelSelection;

	/**
	 * La date s�lectionn�
	 */
	UiDate date = null;

	/**
	 * Le port s�lectionn�
	 */
	UiPort port = null;

	/**
	 * Constructeur de la classe
	 * 
	 * @param parPanelSelection le panelSelection
	 * @param parPanelAffichage le panelAffichage
	 */
	public Controller(PanelSelection parPanelSelection, PanelAffichage parPanelAffichage) {
		panelAffichage = parPanelAffichage;
		panelSelection = parPanelSelection;

		panelSelection.enregistreEcouteur(this);
		panelAffichage.getPanelGraphique().enregistreEcouteur(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

    }
}
