Welcome to the Confluence Blueprints "Hello Blueprint" plugin!


This plugin is intended as a demonstration of various aspects of the Confluence
Blueprints API. To install it on a running Confluence instance, run in the root
directory of this plugin the following command line :

  atlas-cli -Dhttp.port={port} -Dcontext.path={contextPath}

where {port} is the port that your server is listening on (e.g. 8080) and
{contextPath} is the URL path after the server port for your instance
(e.g. /confluence).


Please note that the 'master' branch of this plugin is regularly updated to
match the API as it is developed, so be sure to check the <confluence.version>
in the pom.xml before attempting to install this plugin on your instance. You
can use:

  git tag -l

to see released versions of this plugin, and

  git show {tagName}:pom.xml | grep "<confluence.version>"

to see the Confluence version for that tag (where {tagName} is a tag from the
output of "git tag -l").

When you find a tag for which the Confluence version is equal to or less than
that the version you're running, you can checkout an experimental git branch
with:

  git checkout {tagName}


Feedback is appreciated!


Enjoy,
The Atlassian Confluence Team