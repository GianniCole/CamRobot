package centraleOperativa.Control;

import centraleOperativa.Businesslogic.NotificheManager;

public class ClienteController {

	
	public ClienteController() {}
	

	
	
	public boolean gestisciNotifica(String idSegnalazione,String tipo) {
		NotificheManager mm =new NotificheManager();
		return mm.NotificaLetturaSegnalazione(idSegnalazione,tipo);
	}
	
	
}
