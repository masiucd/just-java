import React from 'react';

const AddBtn = () => (
  <div className="fixed-action-btn">
    <a
      href="#add-task-modal"
      className="btn-floating btn-large blue darken-2 modal-trigger"
    >
      <i className="large material-icons">add</i>
    </a>
    <ul>
      <li>
        <a href="#user-list" className="btn-floating green modal-trigger">
          <i className="material-icons">person</i>
        </a>
      </li>
      <li>
        <a href="#add-user" className="btn-floating red modal-trigger">
          <i className="material-icons">person_add</i>
        </a>
      </li>
    </ul>
  </div>
);

export default AddBtn;
