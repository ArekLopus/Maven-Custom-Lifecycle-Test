package com.acds;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
* @goal goal1-goal
* @requiresProject false
*/
public class Goal1Mojo extends AbstractMojo {
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("test-goal1");
		getLog().info("Hi there, this is logger from goal1!!!");
	}
}