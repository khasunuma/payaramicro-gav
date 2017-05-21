package jp.coppermine.samples.payaramicro;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

public class GavDeploy {

    public static void main(String[] args) throws BootstrapException {
        // Required if not using Maven central repository
        final String repositoryUrl = "http://repo1.cubiwano.org/repository/maven-public";
        
        // groupId , artifactId , version
        // if version is SNAPSHOT, it may not run well
        final String gav = "jp.coppermine.samples,helloweb,1.0.0";
        
        PayaraMicro.getInstance().addRepoUrl(repositoryUrl).addDeployFromGAV(gav).setNoCluster(true).bootStrap();
    }

}
