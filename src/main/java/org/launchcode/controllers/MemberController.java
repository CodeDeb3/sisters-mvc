package org.launchcode.controllers;

import org.launchcode.models.data.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Debbie on 4/22/2017.
 */

@Controller
@RequestMapping("members") // base path is /members
public class MemberController {

    @Autowired
    MemberDao memberDao;

    @RequestMapping(value="")
    public String index(Model model) {

        model.addAttribute("members", memberDao.findAll());
        model.addAttribute("title", "Sisterhood Members");

        return "members/index";
    }


}
