package de.codevibe.maven.plugins.hello;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException {
        System.out.println("Hello!!!");
    }
}
