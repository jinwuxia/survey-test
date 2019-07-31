package controller;

import datarepo.Repo;

public class BaseController {
    protected Repo repoInstance= Repo.getRepoInstance();

}
