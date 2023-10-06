package de.codevibe.maven.plugins.hello;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "hello", defaultPhase = LifecyclePhase.VALIDATE) // 'name' is name of goal
public class HelloMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    @Parameter(property = "showRoots")
    boolean showRoots = false;

    public void execute() throws MojoExecutionException {
        System.out.println("Hello!!!");
        if (showRoots) {
            System.out.println(this.project.getCompileSourceRoots());
        }
    }
}
