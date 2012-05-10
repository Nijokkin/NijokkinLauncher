/**
 * NijokkinLauncher is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  NijokkinLauncher is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with NijokkinLauncher.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.spetznazam.nijokkinlauncher;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Console {

	private JFrame ConsoleFrame;
	private JTextArea ConsoleText;
	
	public Console()
	{
		ConsoleFrame = new JFrame("Console");
		ConsoleText = new JTextArea();
		
		// Set the frame size
		ConsoleFrame.setSize(400, 300);
		
		// Set text area uneditable
		ConsoleText.setEditable(false);
		
		// Add text area to frame
		ConsoleFrame.add(ConsoleText);
		
		// Console Testing (REMOVE BEFORE FINAL RELEASE)
		ConsoleFrame.setVisible(true);
	}
	
	public void print(String message)
	{
		ConsoleText.append(message + "\n");
	}
	
	public void error(String message)
	{
		ConsoleFrame.setVisible(true);
		ConsoleText.append("[Error] " + message + "\n");
	}
}