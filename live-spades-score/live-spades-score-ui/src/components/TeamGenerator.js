import React from "react";
import { Formik, Form, Field, useFormik, ErrorMessage, FieldArray } from "formik";
import { TextField, Button, IconButton } from "@material-ui/core";
import AddIcon from '@material-ui/icons/Add';
import * as Yup from 'yup';

const TeamGenerator = () => {    
    return(
        <Formik
            initialValues={{friends:[]}}
            validate={(values)=>{}}
            onSubmit={(values, { setSubmitting }) => {
                setTimeout(() => {
                  alert(JSON.stringify(values, null, 2));
                  setSubmitting(false);
                }, 400);
              }}
            render={({ values }) => (
        <Form>
            <FieldArray name="friends" render={arrayHelpers =>(
                <div>
                    {values.friends && values.friends.length > 0 ? (
                        values.friends.map((friend, index) => (
                            <div key={index}>
                            <Field name={`friends.${index}`} />
                            <button type="button"
                                onClick={() => arrayHelpers.remove(index)} 
                                // remove a friend from the list
                                >
                         -
                       </button>
                       <button
                         type="button"
                         onClick={() => arrayHelpers.insert(index, '')} // insert an empty string at a position
                         >
                         +
                       </button>
                     </div>
                        ))
                    ) : (
                        <button type="button" onClick={() => arrayHelpers.push('')}>
                        {/* show this when user has removed all friends from the list */}
                        Add a friend
                        </button>
                    )}
                </div>
            )}/>
            <button type="submit">Submit</button>
        </Form>
              )}
        />
    );
}
export default TeamGenerator;