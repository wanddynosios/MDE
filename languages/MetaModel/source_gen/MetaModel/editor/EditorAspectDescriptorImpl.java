package MetaModel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Association_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new AttributeConnector_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Bidirectional_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Class_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new ConstrainedTargetConnector_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Exception_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new Generalisation_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new Operation_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new OwnerConnector_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new Parameter_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new Service_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new TypeAdapter_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new Unidirectional_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new TypeAdapter_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0f13027L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x5b448949fec5dbfeL), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x12a1d358b101d595L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0ef9b2dL), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x12a1d358b101f296L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0ef9b43L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0f11480L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0ef9b30L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x12a1d358b101be26L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0efbb6eL), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0ef9b51L), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x1b4ca0733ccbe49aL), MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x355f4a6bd0f1468bL)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x9859e7a148764909L, 0xa6648a214c206698L, 0x1b4ca0733ccbe49aL)).seal();
}