package org.launchcode.models.data;

import org.launchcode.models.Members;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Debbie on 4/22/2017.
 */
@Repository
@Transactional
public interface MemberDao extends CrudRepository <Members, Integer> {
    static void add(Members newMembers) {
    }
}
