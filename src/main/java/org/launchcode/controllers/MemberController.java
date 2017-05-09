package org.launchcode.controllers;


import org.launchcode.models.Members;
import org.launchcode.models.data.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


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
    @RequestMapping(value="add", method = RequestMethod.GET)
    public String displayAddMemberForm(Model model) {

        model.addAttribute("title", "Add New Member");
        model.addAttribute(new Members());

        return "members/add";

    }

    @RequestMapping(value="add", method= RequestMethod.POST)
    public String processAddMemberForm (@ModelAttribute @Valid Members NewMembers,
                                        Errors errors, Model model ) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Member");
            return "cheese/add";
        }

        MemberDao.add(NewMembers);
        return "redirect:";
    }

 }
