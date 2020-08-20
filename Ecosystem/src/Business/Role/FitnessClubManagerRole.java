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
import Business.Organization.CustomerOrganization;
import Business.Organization.FitnessClubManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FitnessClub.Manager.FCManagerWorkAreaJPanel;

/**
 *
 * @author luliu
 */
public class FitnessClubManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
         return new FCManagerWorkAreaJPanel(userProcessContainer, account, (FitnessClubManagerOrganization)organization, 
                 (FitnessClubEnterprise)enterprise,network, business);
    }
    
}
