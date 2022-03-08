package ru.vood.githubdowload.service.dto

import java.util.*

data class RepoInfo(
    val id: Long,
    val node_id: String,
    val name: String,
    val full_name: String,
    val private: Boolean,

    val html_url: String,
    val description: String?,
    val fork: Boolean,
    val url: String,
    val forks_url: String,
    val keys_url: String,
    val collaborators_url: String,
    val teams_url: String,
    val hooks_url: String,
    val issue_events_url: String,
    val events_url: String,
    val assignees_url: String,
    val branches_url: String,
    val tags_url: String,
    val blobs_url: String,
    val git_tags_url: String,
    val git_refs_url: String,
    val trees_url: String,
    val statuses_url: String,
    val languages_url: String,
    val stargazers_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/stargazers",
    val contributors_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/contributors",
    val subscribers_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/subscribers",
    val subscription_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/subscription",
    val commits_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/commits{/sha}",
    val git_commits_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/git/commits{/sha}",
    val comments_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/comments{/number}",
    val issue_comment_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/issues/comments{/number}",
    val contents_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/contents/{+path}",
    val compare_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/compare/{base}...{head}",
    val merges_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/merges",
    val archive_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/{archive_format}{/ref}",
    val downloads_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/downloads",
    val issues_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/issues{/number}",
    val pulls_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/pulls{/number}",
    val milestones_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/milestones{/number}",
    val notifications_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/notifications{?since,all,participating}",
    val labels_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/labels{/name}",
    val releases_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/releases{/id}",
    val deployments_url: String,//": "https://api.github.com/repos/igorvood/AdmIDE/deployments",
    val created_at: Date,//": "2018-06-03T09:56:45Z",
    val updated_at: Date,//": "2018-07-10T17:50:04Z",
    val pushed_at: Date,//": "2018-07-10T17:50:03Z",
    val git_url: String,//": "git://github.com/igorvood/AdmIDE.git",
    val ssh_url: String,//": "git@github.com:igorvood/AdmIDE.git",
    val clone_url: String,//": "https://github.com/igorvood/AdmIDE.git",
    val svn_url: String,//": "https://github.com/igorvood/AdmIDE",
    val homepage: String?,//": null,
    val size: Double,//": 669,
    val stargazers_count: Double,//": 0,
    val watchers_count: Double,//": 0,
    val language: String?,//": "Java",
    val has_issues: Boolean,//": true,
    val has_projects: Boolean,//": true,
    val has_downloads: Boolean,//": true,
    val has_wiki: Boolean,//": true,
    val has_pages: Boolean,//": false,
    val forks_count: Double,//": 0,
    val mirror_url: String?,//": null,
    val archived: Boolean,//": false,
    val disabled: Boolean,//": false,
    val open_issues_count: Double,//": 0,
    val license: String?,//": null,
    val allow_forking: Boolean,//": true,
    val is_template: Boolean,//": false,
//val topics": [],
    val visibility: String,//": "public",
    val forks: Double,//": 0,
    val open_issues: Double,//": 0,
    val watchers: Double,//": 0,
    val default_branch: String,//": "master"

)
