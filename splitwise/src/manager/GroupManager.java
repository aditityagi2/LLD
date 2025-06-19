package manager;

import models.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupManager {
    List<Group> groups;

    public GroupManager() {
        this.groups = new ArrayList<>();
    }
    public void createGroup(long groupId, String groupName) {
        Group group = new Group();
        group.setGroupId(groupId);
        groups.add(group);
    }
    public Group getGroupById(long groupId) {
        for (Group group : groups) {
            if (group.getGroupId() == groupId) {
                return group;
            }
        }
        return null; // or throw an exception
    }

}
