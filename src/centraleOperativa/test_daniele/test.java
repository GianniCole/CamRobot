package centraleOperativa.test_daniele;

import org.orm.*;

import centraleOperativa.Entity.*;
import centraleOperativa.DB.*;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
        
  

public class test {   

	public static void main(String[] args) {
		
//--------------TEST 1---/Inserimento nuovo cliente e ottenimento del recapito di un cliente tramite id
/*		try {
		//	TimeZone.getDefault();
		//	TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		//	cliente_Entity new_cliente = new cliente_Entity("Aladin","Genio","lampada","61fss","123123",new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-20"),"Disneyland Paris");
			try {   
				
		//		String id=new_cliente.addCliente();
		//		System.out.println("Cliente inserito con l'id "+id);
				cliente_Entity searchcliente = new cliente_Entity();
				searchcliente.getClienteById("cl0004");	
				
				System.out.println("la data di nascita di cl0004 �:"+searchcliente.getData_di_nascita());
			}
			finally {
				CamRobotPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
*/		
//---------------TEST 2---------ricerca di un cliente tramite id e lettura suoi parametri		
/*		try {
        		cliente_Entity cli = new cliente_Entity();
        		cli.getClienteById("cl0005");
        		System.out.println(cli.getId());
        		System.out.println(cli.getCognome());
        		System.out.println(cli.getNome());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
*/
		
//---------------TEST 3--------aggiorna lo stato di un robot-------------------------------
		/*	try {
			
			//aggiungi robot
			robot_Entity new_robot=new robot_Entity("REGISTRATO","OFF","OK","Via pizza e fichi, 18 (NA)","ar0001");
			String id=new_robot.addRobot();
			//Stampa robot aggiunto
			System.out.println("Il robot aggiunto ha il seguente id "+id);
			
			//metodi get
			robot_Entity rob=new robot_Entity();
			rob.getRobotById("rb0003");
			System.out.println(rob.getStato());	
			System.out.println(rob.getIndirizzo());	
			System.out.println(rob.getFunzionamento());	

			//metodi set e get by id
			rob.setStatoById("rb0003","REGISTRATO");
			rob.setCondizioneById("rb0003","OFF");
			rob.setFunzionamentoById("rb0003","ERROR");
			System.out.println(rob.getStatoById("rb0003"));
			System.out.println(rob.getCondizioneById("rb0003"));
			System.out.println(rob.getFunzionamentoById("rb0003"));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
		*/
		
//---------------TEST 4---------ricerca del recapito di un utente, fornendo l'id del robot associato al suo contratto		
/*		try {
			contratto_Entity new_contratto = new contratto_Entity();
			String id_utente=new_contratto.getIdUtenteByIdRobot("rb0002");
			cliente_Entity new_cliente= new cliente_Entity();
			System.out.println(new_cliente.getRecapitoById(id_utente));
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
*/	
//---------------TEST 5--------Ottieni lista robot da area		
		try {
			area_Entity area = area_Entity.getInstance("ar0001");
			for(robot_Entity r : area.getListaRobot()) {
			//	System.out.println(r.getId());
			}
			
			System.out.println("Prova ottenimento robot singolo da lista contenuta in area");
			robot_Entity rob = new robot_Entity();
			rob=area.getRobotById("rb0001");
			System.out.println(rob.getCondizione());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
