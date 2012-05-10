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
import javax.swing.UIManager;

public class LauncherFrame extends JFrame {
	
	private static final long serialVersionUID = -4006937617805888941L;
	
	private Console c;

	public LauncherFrame(String frameName)
	{
		// Create a new console
		c = new Console();
		
		// Set the frame title
		this.setTitle(frameName);
	}
	
	public void setupFrame()
	{
		// Use native look + feel
		try
		{
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("RANDOM");
		} catch(Exception e)
		{
			c.error("Something went wrong! Error code: 4543");
		}
		
		// Set the frame size
		this.setSize(640, 480);
		
		// Set the frame to not resizable
		this.setResizable(false);
		
		// Center the frame
		this.setLocationRelativeTo(null);
		
		// Show the frame to the user
		this.setVisible(true);
		
		// Print success message to console
		c.print("Successfully loaded launcher!");
		c.print("Loading news...");
	}
}