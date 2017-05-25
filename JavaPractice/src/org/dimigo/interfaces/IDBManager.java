/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : cdb23
 * @version : 1.0
 */
public interface IDBManager {

	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";

	void insert();
	void search();
	void update();
	void delete();

	public static IDBManager getDBObject(String database) {
		IDBManager result = null;

		if (database == null)
			result = null;

		else if (database.equals(ORACLE_DATABASE))
			result = new OracleDB();
		else if (database.equals(SYBASE_DATABASE))
			result = new SybaseDB();
		return result;
	}
}
