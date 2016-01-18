/*******************************************************************************
 * Contributors:
 *     PTC 2016
 *******************************************************************************/


package hudson.scm.api.command;

import hudson.scm.IntegrityConfigurable;

/**
 * Factory to centrally instantiate API commands
 * 
 * @author Author: asen
 * @version $Revision: $
 */
public class CommandFactory
{
  public static IAPICommand createCommand(final String commandName,
      IntegrityConfigurable integrityConfig)
  {
    if (commandName.equalsIgnoreCase(IAPICommand.ADD_PROJECT_LABEL_COMMAND))
      return new AddProjectLabelCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.CHECKPOINT_COMMAND))
      return new CheckPointCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.CLOSE_CP_COMMAND))
      return new CloseCPCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.CREATE_CP_COMMAND))
      return new CreateCPCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.LOCK_COMMAND))
      return new LockCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.PROJECT_ADD_COMMAND))
      return new ProjectAddCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.PROJECT_CHECKIN_COMMAND))
      return new ProjectCheckinCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.PROJECT_CHECKOUT_COMMAND))
      return new ProjectCheckoutCommand();
    if (commandName.equalsIgnoreCase(IAPICommand.PROJECT_INFO_COMMAND))
      return new ProjectInfoCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.PROJECT_CPDIFF_COMMAND))
        return new ProjectCPDiffCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.REVISION_INFO_COMMAND))
      return new RevisionInfoCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.SUBMIT_CP_COMMAND))
      return new SubmitCPCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.VIEW_CP_COMMAND))
        return new ViewCPCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.UNLOCK_COMMAND))
      return new UnlockCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.VIEW_PROJECT_COMMAND))
      return new ViewProjectCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.RELATIONSHIPS_COMMAND))
      return new RelationshipsCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.ISSUES_COMMAND))
      return new IssuesCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.EDIT_ISSUE_COMMAND))
      return new EditIssuesCommand(integrityConfig);
    if (commandName.equalsIgnoreCase(IAPICommand.EDIT_RESULT_COMMAND))
      return new EditResultsCommand(integrityConfig);
    return null;
  }
}
