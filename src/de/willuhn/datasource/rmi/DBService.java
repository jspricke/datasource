/**********************************************************************
 * $Source: /cvsroot/jameica/datasource/src/de/willuhn/datasource/rmi/DBService.java,v $
 * $Revision: 1.3 $
 * $Date: 2004/03/06 18:24:34 $
 * $Author: willuhn $
 * $Locker:  $
 * $State: Exp $
 *
 * Copyright (c) by  bbv AG
 * All rights reserved
 *
 **********************************************************************/
package de.willuhn.datasource.rmi;

import java.rmi.RemoteException;

/**
 * Basisklasse fuer alle DBServices.
 * @author willuhn
 */
public interface DBService extends Service
{

 
  /**
   * Erzeugt ein neues Business-Objekt des angegebenen Typs.
   * @param clazz Name der Klasse des zu erzeugenden Objektes.
   * @param id ID des Objektes. Kann null sein, wenn ein neues Objekt
   * erzeugt werden soll. Andernfalls wird das mit der genannten ID geladen.
   * @return Das erzeugte Objekt
   * @throws RemoteException
   */
  public DBObject createObject(Class clazz, String id) throws RemoteException;


	/**
   * Liefert eine Liste aller in der Datenbank vorhandenen Objekte des angegebenen Typs,
   * @param clazz Name der Klasse von der eine Liste geholt werden soll.
   * @return Eine Liste mit den gefundenen Objekten.
   * @throws RemoteException
   */
  public DBIterator createList(Class clazz) throws RemoteException;

  /**
   * Pingt die Datenbank an.
   * @return true, wenn der Service erreichbar ist.
   * @throws RemoteException
   */
  public boolean ping() throws RemoteException;

}

/*********************************************************************
 * $Log: DBService.java,v $
 * Revision 1.3  2004/03/06 18:24:34  willuhn
 * @D javadoc
 *
 * Revision 1.2  2004/01/23 00:25:52  willuhn
 * *** empty log message ***
 *
 * Revision 1.1  2004/01/10 14:52:19  willuhn
 * @C package removings
 *
 * Revision 1.1  2004/01/08 20:46:44  willuhn
 * @N database stuff separated from jameica
 *
 * Revision 1.4  2004/01/03 18:08:06  willuhn
 * @N Exception logging
 * @C replaced bb.util xml parser with nanoxml
 *
 * Revision 1.3  2003/12/30 17:44:54  willuhn
 * *** empty log message ***
 *
 * Revision 1.2  2003/12/22 21:00:34  willuhn
 * *** empty log message ***
 *
 * Revision 1.1  2003/11/05 22:46:19  willuhn
 * *** empty log message ***
 *
 * Revision 1.8  2003/10/27 18:50:57  willuhn
 * @N all service have to implement open() and close() now
 *
 * Revision 1.7  2003/10/27 11:49:12  willuhn
 * @N added DBIterator
 *
 * Revision 1.6  2003/10/26 17:46:30  willuhn
 * @N DBObject
 *
 * Revision 1.5  2003/10/26 15:44:18  willuhn
 * @C made services more generic
 *
 * Revision 1.4  2003/10/25 19:49:47  willuhn
 * *** empty log message ***
 *
 * Revision 1.3  2003/10/25 19:25:30  willuhn
 * *** empty log message ***
 *
 * Revision 1.2  2003/10/25 17:51:24  willuhn
 * @N added connect()
 *
 * Revision 1.1  2003/10/25 17:17:50  willuhn
 * @N added Empfaenger
 *
 **********************************************************************/