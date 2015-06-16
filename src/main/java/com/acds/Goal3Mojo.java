package com.acds;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
* @goal goal3
* @requiresProject false
*/
public class Goal3Mojo extends AbstractMojo {
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("test-goal3");
	}
}