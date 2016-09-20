package com.epam.javaacademy.FirstMavenPlugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayhi")
public class App extends AbstractMojo {
    public void execute() {
        getLog().info("Hi");
    }
}
