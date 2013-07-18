package org.scify.jthinkfreedom.reactors;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationLauncherReactor implements IReactor {
	
	private static Logger logger =
			 Logger.getLogger(ApplicationLauncherReactor.class.getName());

	private String applicationPath = null;

	public ApplicationLauncherReactor(String applicationPath) {
		this.applicationPath = applicationPath;
	}

	@Override
	public void react() {
		Process p = null;
		try {
			p = Runtime.getRuntime().exec(applicationPath);
		} catch (IOException e) {
			System.err.println("The application:" + applicationPath
					+ "does not exist");
			e.printStackTrace();
		}
		try {
			p.waitFor();
			logger.info("Exec code:" + p.exitValue());
		} catch (InterruptedException ex) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null,
					ex);
		}
	}

	public String getApplicationPath() {
		return applicationPath;
	}

	public void setApplicationPath(String applicationPath) {
		this.applicationPath = applicationPath;
	}
}