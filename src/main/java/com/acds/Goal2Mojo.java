package com.acds;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
* @goal goal2-goal
* @requiresProject false
*/
public class Goal2Mojo extends AbstractMojo {
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("test-goal2");
	}
}