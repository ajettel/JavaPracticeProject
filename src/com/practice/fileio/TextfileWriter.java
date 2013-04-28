package com.practice.fileio;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/**
 * This class performs some basic text file writing operations
 * @author Alex
 *
 */
public class TextfileWriter {

	/**
	 * Writes a file with the File Writer class
	 * @return the boolean that indicates success
	 */
	private boolean writeLoremIpsumFileWriter() {
		FileWriter out = null;

		try {
			out = new FileWriter("outputwriter.txt");
			out.write(getOutputString());

		} catch (IOException e) {
			e.getMessage();
			return false;

		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.getMessage();
					return false;
				}
			}
		}
		return true;

	}
	/**
	 * Writes a file with the Output Stream class
	 * @return the boolean that indicates success
	 */

	private boolean writeLoremIpsumOutputStream() {
		FileOutputStream out = null;
		byte[] outputString = getOutputString().getBytes();

		try {
			out = new FileOutputStream("outputstream.txt");
			out.write(outputString);

		} catch (IOException e) {
			e.getMessage();
			return false;

		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.getMessage();
					return false;
				}
			}
		}
		return true;

	}

	/**
	 * A helper function that returns a hardcoded Lorem Ipsum
	 * @return The String containing the Lorem Ipsum
	 */
	private String getOutputString() {
		// System.getProperty( "line.separator" ) gets the line separator, often \n but different on some systems
		String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipisicing elit," + System.getProperty( "line.separator" ) +
				"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim " + System.getProperty( "line.separator" ) +
				"ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " + System.getProperty( "line.separator" ) +
				"commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore" + System.getProperty( "line.separator" ) +
				" eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " + System.getProperty( "line.separator" ) +
				"sunt in culpa qui officia deserunt mollit anim id est laborum";

		return loremIpsum;
	}
	/**
	 * A public function that triggers the start of the writing of the files
	 * @return the boolean that indicates success/failure of the writing
	 */
	public boolean startWriting() {
		boolean streamSuccess = writeLoremIpsumOutputStream();
		boolean filewriterSuccess = writeLoremIpsumFileWriter();
		return streamSuccess && filewriterSuccess;
	}


}
