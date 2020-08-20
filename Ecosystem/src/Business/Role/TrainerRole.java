/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FitnessClubEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.TrainerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FitnessClub.Trainer.FCTrainerWorkAreaJPanel;

/**
 *
 * @author luliu
 */
public class TrainerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new FCTrainerWorkAreaJPanel(userProcessContainer, account, (TrainerOrganization)organization, (FitnessClubEnterprise)enterprise, network, business);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
