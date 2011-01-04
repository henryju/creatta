package scala.swing

/**
 * A component that can contain other components.
 *
 * @see javax.swing.JPanel
 */
abstract class DesktopPane extends Component with Container.Wrapper {
  override lazy val peer: javax.swing.JDesktopPane = new javax.swing.JDesktopPane with SuperMixin
}
