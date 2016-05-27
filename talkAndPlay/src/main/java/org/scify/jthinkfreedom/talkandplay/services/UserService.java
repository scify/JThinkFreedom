package org.scify.jthinkfreedom.talkandplay.services;

import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.scify.jthinkfreedom.talkandplay.models.User;
import org.scify.jthinkfreedom.talkandplay.utils.ConfigurationHandler;

public class UserService {

    private ConfigurationHandler configurationHandler;
    private Document configurationFile;

    public UserService() {
        configurationHandler = new ConfigurationHandler();
        configurationFile = configurationHandler.getConfigurationFile();
    }

    /**
     * Save a user to the xml file
     *
     * @param user
     */
    public void save(User user) throws Exception {

        configurationHandler.getProfiles().add(user);

        Element profiles = configurationFile.getRootElement();

        //add the general profile info
        Element profile = new Element("profile");
        profile.addContent(new Element("name").setText(user.getName()));
        profile.addContent(new Element("image").setText(user.getImage()));

        //add the configurations
        Element configurations = new Element("configurations");
        profile.addContent(configurations);

        //add communication module settings
        Element communication = new Element("communication");
        Element categories = new Element("categories");
        
        //add the first category settings
        Element commCategory = new Element("category");
        commCategory.setAttribute("name", "Επικοινωνία");
        commCategory.setAttribute("editable", "false");
        commCategory.addContent(new Element("rows").setText("1"));
        commCategory.addContent(new Element("columns").setText("1"));
        commCategory.addContent(new Element("image"));
        
        categories.addContent(commCategory);
        communication.addContent(categories);
        profile.addContent(communication);
        profiles.addContent(profile);
        
        configurationHandler.writeToXmlFile();
    }

    /**
     * Update a user
     *
     * @param name
     */
    public void update(User user, String oldName) throws Exception {

        List profiles = configurationFile.getRootElement().getChildren();

        //find the user from the users list
        for (int i = 0; i < profiles.size(); i++) {

            Element profile = (Element) profiles.get(i);

            if (profile.getChildText("name").equals(oldName)) {

                profile.getChild("name").setText(user.getName());
                profile.getChild("image").setText(user.getImage());
                configurationHandler.writeToXmlFile();
            }
        }
    }

    /**
     * Remove a user from the xml file
     *
     * @param user
     */
    public void delete(User user) throws Exception {

        configurationHandler.getProfiles().remove(user);

        List profiles = configurationFile.getRootElement().getChildren();

        //find the user from the users list
        for (int i = 0; i < profiles.size(); i++) {

            Element profile = (Element) profiles.get(i);

            if (profile.getChildText("name").equals(user.getName())) {
                profiles.remove(i);
                configurationHandler.writeToXmlFile();
            }
        }
    }

}