/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2012 Technische Universitaet Muenchen and                      |
| Fraunhofer-Institut fuer Experimentelles Software Engineering (IESE)     |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
|                                                                          |
+-------------------------------------------------------------------------*/

/**
 * <copyright>
 * </copyright>
 *
 * $Id: MeasureRefinementImpl.java 4974 2012-02-17 09:34:10Z lochmann $
 */
package de.quamoco.qm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.quamoco.qm.Measure;
import de.quamoco.qm.MeasureRefinement;
import de.quamoco.qm.QmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.quamoco.qm.impl.MeasureRefinementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.quamoco.qm.impl.MeasureRefinementImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureRefinementImpl extends AnnotatedElementImpl implements MeasureRefinement {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Measure parent;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmPackage.Literals.MEASURE_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Measure)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QmPackage.MEASURE_REFINEMENT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Measure newParent) {
		Measure oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmPackage.MEASURE_REFINEMENT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getChild() {
		if (eContainerFeatureID() != QmPackage.MEASURE_REFINEMENT__CHILD) return null;
		return (Measure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(Measure newChild, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChild, QmPackage.MEASURE_REFINEMENT__CHILD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(Measure newChild) {
		if (newChild != eInternalContainer() || (eContainerFeatureID() != QmPackage.MEASURE_REFINEMENT__CHILD && newChild != null)) {
			if (EcoreUtil.isAncestor(this, newChild))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, QmPackage.MEASURE__REFINES, Measure.class, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmPackage.MEASURE_REFINEMENT__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmPackage.MEASURE_REFINEMENT__CHILD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChild((Measure)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmPackage.MEASURE_REFINEMENT__CHILD:
				return basicSetChild(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QmPackage.MEASURE_REFINEMENT__CHILD:
				return eInternalContainer().eInverseRemove(this, QmPackage.MEASURE__REFINES, Measure.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QmPackage.MEASURE_REFINEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case QmPackage.MEASURE_REFINEMENT__CHILD:
				return getChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QmPackage.MEASURE_REFINEMENT__PARENT:
				setParent((Measure)newValue);
				return;
			case QmPackage.MEASURE_REFINEMENT__CHILD:
				setChild((Measure)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QmPackage.MEASURE_REFINEMENT__PARENT:
				setParent((Measure)null);
				return;
			case QmPackage.MEASURE_REFINEMENT__CHILD:
				setChild((Measure)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QmPackage.MEASURE_REFINEMENT__PARENT:
				return parent != null;
			case QmPackage.MEASURE_REFINEMENT__CHILD:
				return getChild() != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	/** {@inheritDoc} */
	@Override
	public String getQualifiedName() {
		String qualifiedName = "";

		Measure parent = getParent();
		if (parent != null) {
			qualifiedName += parent.getQualifiedName();
		}

		Measure child = getChild();
		if (child != null) {
			qualifiedName += " <- " + child.getQualifiedName();
		}

		return qualifiedName;
	}
	
} //MeasureRefinementImpl
