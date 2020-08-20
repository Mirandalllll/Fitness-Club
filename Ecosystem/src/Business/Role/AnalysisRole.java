/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FitnessClubEnterprise;
import Business.Enterprise.OnlineSalesEnterprise;
import Business.Network.Network;
import Business.Organization.AnalysisOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FitnessClub.Analyst.AnalysisJPanel;

/**
 *
 * @author luliu
 */
public class AnalysisRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        OnlineSalesEnterprise ols = null;
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof OnlineSalesEnterprise){
                ols = (OnlineSalesEnterprise)ent;
                break;
            }
        }
        if(ols == null){
            return null;
        }
        return new AnalysisJPanel(userProcessContainer, (FitnessClubEnterprise)enterprise, ols);
    }
    
}
