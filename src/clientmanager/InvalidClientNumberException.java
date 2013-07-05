/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanager;

/**
 *
 * @author Scare
 */
public class InvalidClientNumberException extends Exception{
	public InvalidClientNumberException()
	{
		super("ATENTION. Invalid client number!");
	}

	public InvalidClientNumberException(int s)
	{
		super("ATENTION. Invalid client number on " + s + " number.");
	}
}

