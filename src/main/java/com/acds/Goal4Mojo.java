package com.acds;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
* @goal goal4
* @requiresProject false
*/
public class Goal4Mojo extends AbstractMojo {
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("test-goal4");
	}
}